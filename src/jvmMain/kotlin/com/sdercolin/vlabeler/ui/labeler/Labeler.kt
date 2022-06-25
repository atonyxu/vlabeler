package com.sdercolin.vlabeler.ui.labeler

import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdercolin.vlabeler.audio.PlayerState
import com.sdercolin.vlabeler.env.KeyboardViewModel
import com.sdercolin.vlabeler.env.Log
import com.sdercolin.vlabeler.model.AppConf
import com.sdercolin.vlabeler.model.Entry
import com.sdercolin.vlabeler.model.LabelerConf
import com.sdercolin.vlabeler.model.Sample
import com.sdercolin.vlabeler.ui.AppState
import com.sdercolin.vlabeler.ui.dialog.EmbeddedDialogArgs
import com.sdercolin.vlabeler.ui.dialog.SetResolutionDialogArgs
import com.sdercolin.vlabeler.ui.theme.Black50
import com.sdercolin.vlabeler.util.update
import kotlinx.coroutines.flow.collectLatest

@Immutable
data class LabelerState(val canvasResolution: Int) {
    fun changeResolution(resolution: Int) = copy(canvasResolution = resolution)
}

@Composable
fun Labeler(
    sample: Sample?,
    sampleName: String,
    entry: Entry,
    entriesInSample: List<Entry>,
    currentIndexInSample: Int,
    currentIndexInTotal: Int,
    totalEntryCount: Int,
    editEntry: (Entry) -> Unit,
    submitEntry: () -> Unit,
    playSampleSection: (Float, Float) -> Unit,
    showDialog: (EmbeddedDialogArgs) -> Unit,
    appConf: AppConf,
    labelerConf: LabelerConf,
    labelerState: MutableState<LabelerState>,
    appState: MutableState<AppState>,
    playerState: PlayerState,
    keyboardViewModel: KeyboardViewModel,
    scrollFitViewModel: ScrollFitViewModel
) {
    val isBusy = sample == null
    val horizontalScrollState = rememberScrollState(0)
    val currentResolution = labelerState.value.canvasResolution

    LaunchedEffect(Unit) {
        scrollFitViewModel.eventFlow.collectLatest {
            horizontalScrollState.animateScrollTo(it)
        }
    }

    Column(Modifier.fillMaxSize()) {
        EntryTitleBar(entryName = entry.name, sampleName = sampleName)
        Box(Modifier.fillMaxWidth().weight(1f).border(width = 0.5.dp, color = Black50)) {
            Canvas(
                sample = sample,
                entry = entry,
                entriesInSample = entriesInSample,
                currentIndexInSample = currentIndexInSample,
                isBusy = isBusy,
                editEntry = editEntry,
                submitEntry = submitEntry,
                playSampleSection = playSampleSection,
                appConf = appConf,
                labelerConf = labelerConf,
                resolution = currentResolution,
                playerState = playerState,
                horizontalScrollState = horizontalScrollState,
                keyboardViewModel = keyboardViewModel,
                scrollFitViewModel = scrollFitViewModel
            )
        }
        HorizontalScrollbar(
            modifier = Modifier.fillMaxWidth().height(20.dp),
            adapter = rememberScrollbarAdapter(horizontalScrollState)
        )
        BottomBar(
            currentEntryIndexInTotal = currentIndexInTotal,
            totalEntryCount = totalEntryCount,
            resolution = currentResolution,
            onChangeResolution = { labelerState.update { changeResolution(it) } },
            openSetResolutionDialog = {
                showDialog(
                    SetResolutionDialogArgs(
                        current = currentResolution,
                        min = appConf.painter.canvasResolution.min,
                        max = appConf.painter.canvasResolution.max
                    )
                )
            },
            canSwitchToPrevious = currentIndexInTotal > 0,
            canSwitchToNext = currentIndexInTotal < totalEntryCount - 1,
            switchToPreviousEntry = { appState.update { editNonNullProject { previousEntry() } } },
            switchToNextEntry = { appState.update { editNonNullProject { nextEntry() } } },
            switchToPreviousSample = { appState.update { editNonNullProject { previousSample() } } },
            switchToNextSample = { appState.update { editNonNullProject { nextSample() } } },
            openJumpToEntryDialog = { appState.update { openJumpToEntryDialog() } },
            scrollFit = { scrollFitViewModel.emit() },
            appConf = appConf
        )
    }
}

@Composable
private fun EntryTitleBar(entryName: String, sampleName: String) {
    Log.info("EntryTitleBar: composed")
    Surface {
        Box(
            modifier = Modifier.fillMaxWidth()
                .heightIn(min = 80.dp)
                .background(color = MaterialTheme.colors.surface)
                .padding(horizontal = 20.dp)
        ) {
            Row(modifier = Modifier.align(Alignment.CenterStart)) {
                Text(
                    modifier = Modifier.alignByBaseline(),
                    text = entryName,
                    style = MaterialTheme.typography.h3,
                    maxLines = 1
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    modifier = Modifier.alignByBaseline(),
                    text = "（$sampleName）",
                    style = MaterialTheme.typography.h5,
                    maxLines = 1
                )
            }
        }
    }
}
