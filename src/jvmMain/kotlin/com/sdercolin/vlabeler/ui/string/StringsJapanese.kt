@file:Suppress("REDUNDANT_ELSE_IN_WHEN")

package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.ja(): String? = when (this) {
    AppName -> "vLabeler"
    MenuFile -> "ファイル"
    MenuFileNewProject -> "新規プロジェクト..."
    MenuFileOpen -> "開く..."
    MenuFileOpenRecent -> "最近開いたプロジェクト"
    MenuFileOpenRecentClear -> "履歴をクリア"
    MenuFileSave -> "保存"
    MenuFileSaveAs -> "名前を付けて保存..."
    MenuFileExport -> "エクスポート..."
    MenuFileExportOverwrite -> "上書きエクスポート..."
    MenuFileExportOverwriteAll -> "すべて上書きエクスポート..."
    MenuFileInvalidateCaches -> "キャッシュを無効化"
    MenuFileClose -> "閉じる"
    MenuEdit -> "編集"
    MenuEditUndo -> "取り消し"
    MenuEditRedo -> "やり直し"
    MenuEditTools -> "ツール"
    MenuEditToolsCursor -> "カーソル"
    MenuEditToolsScissors -> "はさみ"
    MenuEditToolsPan -> "パン"
    MenuEditRenameEntry -> "このエントリの名前を編集..."
    MenuEditDuplicateEntry -> "このエントリを複製..."
    MenuEditRemoveEntry -> "このエントリを削除..."
    MenuEditToggleDone -> "このエントリの完了状態を切り替える"
    MenuEditToggleStar -> "このエントリのスターマーク状態を切り替える"
    MenuEditEditTag -> "このエントリのタグを編集..."
    MenuEditMultipleEditMode -> "連続の複数エントリを編集"
    MenuView -> "表示"
    MenuViewToggleMarker -> "パラメータマーカーを表示"
    MenuViewPinEntryList -> "エントリリストをピン留め"
    MenuViewPinEntryListLocked -> "エントリリストのボーダーをロックする"
    MenuViewToggleProperties -> "プロパティを表示"
    MenuViewToggleToolbox -> "ツールボックスを表示"
    MenuViewOpenSampleList -> "サンプルリストを開く"
    MenuNavigate -> "ナビゲート"
    MenuNavigateOpenLocation -> "ディレクトリを開く"
    MenuNavigateOpenLocationRootDirectory -> "ルートサンプルディレクトリ"
    MenuNavigateOpenLocationModuleDirectory -> "現在のサブプロジェクトのサンプルディレクトリ"
    MenuNavigateOpenLocationProjectLocation -> "プロジェクトファイルの場所"
    MenuNavigateNextEntry -> "次のエントリ"
    MenuNavigatePreviousEntry -> "前のエントリ"
    MenuNavigateNextSample -> "次のサンプル"
    MenuNavigatePreviousSample -> "前のサンプル"
    MenuNavigateJumpToEntry -> "エントリに移動..."
    MenuNavigateScrollFit -> "このエントリを表示するようにスクロール"
    MenuTools -> "ツール"
    MenuToolsBatchEdit -> "バッチ編集"
    MenuToolsBatchEditManagePlugins -> "プラグインマネージャー..."
    MenuToolsPrerender -> "すべてのグラフをプリレンダリング"
    MenuToolsRecycleMemory -> "メモリを回収"
    MenuSettings -> "設定"
    MenuSettingsPreferences -> "環境設定..."
    MenuSettingsLabelers -> "ラベラー..."
    MenuSettingsTemplatePlugins -> "テンプレート生成器..."
    MenuHelp -> "ヘルプ"
    MenuHelpCheckForUpdates -> "アップデートを確認"
    MenuHelpOpenLogDirectory -> "ログディレクトリを開く"
    MenuHelpOpenLatestRelease -> "最新のリリースページを開く"
    MenuHelpOpenGitHub -> "GitHub リポジトリを開く"
    MenuHelpJoinDiscord -> "Discord サーバーに参加"
    MenuHelpAbout -> "vLabeler について"
    CommonOkay -> "OK"
    CommonApply -> "適用"
    CommonCancel -> "キャンセル"
    CommonYes -> "はい"
    CommonNo -> "いいえ"
    CommonWarning -> "警告"
    CommonError -> "エラー"
    CommonInputErrorPromptNumber -> "数値を入力してください。"
    CommonInputErrorPromptInteger -> "整数を入力してください。"
    CommonInputErrorPromptNumberRange -> "%s 与 %s の間の数値を入力してください。"
    CommonInputErrorPromptNumberMin -> "%s 以上の数値を入力してください。"
    CommonInputErrorPromptNumberMax -> "%s 以下の数値を入力してください。"
    StarterStart -> "はじめる"
    StarterNewProject -> "新規プロジェクト..."
    StarterOpen -> "開く..."
    StarterRecent -> "最近開いたプロジェクト"
    StarterRecentEmpty -> "最近開いたプロジェクトはありません。"
    StarterRecentDeleted -> "このプロジェクトはすでに削除されています。"
    StarterNewSampleDirectory -> "サンプルディレクトリ"
    StarterNewWorkingDirectory -> "プロジェクトファイルの保存先"
    StarterNewProjectTitle -> "新規プロジェクト"
    StarterNewProjectName -> "プロジェクト名"
    StarterNewProjectNameWarning ->
        "このプロジェクト名は既に使用されているため、このまま新規プロジェクトを作成すると、既存のプロジェクトが上書きされます。"
    StarterNewCacheDirectory -> "キャッシュディレクトリ"
    StarterNewLabeler -> "ラベラー"
    StarterNewTemplatePlugin -> "テンプレート生成器"
    StarterNewTemplatePluginNone -> "なし"
    StarterNewInputFile -> "入力ファイル (.%s)"
    StarterNewInputFilePlaceholder -> "（空白の場合、ラベラーによってデフォルトのテンプレートが作成されます）"
    StarterNewInputFileDisabledByLabeler -> "現在選択されているラベラーは入力ファイルを必要としません"
    StarterNewInputFileDisabledByPlugin -> "現在選択されているテンプレート生成器は入力ファイルを必要としません"
    StarterNewEncoding -> "エンコーディング"
    StarterNewAutoExport -> "自動エクスポート"
    StarterNewAutoExportHelp ->
        "保存時、自動的にプロジェクトを入力ファイルに上書きエクスポートします。" +
            "入力ファイルが指定されていない場合、ラベラーが指定した場所にエクスポートされます。"
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin ->
        "複数のサブプロジェクトを扱うラベラーとともに、テンプレート生成器を使用しようとしています。" +
            "これは、すべての既存のラベルファイルを生成されたエントリで上書きする可能性があるため、危険です。" +
            "この設定が必要なものであることを再度確認してください。"
    SampleListIncludedHeader -> "使用されているサンプル"
    SampleListIncludedItemEntryCountSingle -> "%d 個のエントリ"
    SampleListIncludedItemEntryCountPlural -> "%d 個のエントリ"
    SampleListExcludedHeader -> "使用されていないサンプル"
    SampleListExcludedPlaceholder -> "使用されていないサンプルはありません。"
    SampleListEntryHeader -> "エントリ"
    SampleListEntriesPlaceholderUnselected -> "左側でサンプルを選択すると、紐付けられているエントリが表示されます。"
    SampleListEntriesPlaceholderNoEntry -> "このサンプルにはエントリが紐付けられていません。"
    SampleListEntriesPlaceholderNoEntryButton -> "エントリを追加"
    SampleListJumpToSelectedEntryButton -> "選択中のエントリに移動"
    SampleListOpenSampleDirectoryButton -> "サンプルディレクトリを開く"
    SampleListSampleDirectoryLabel -> "サンプルディレクトリ："
    SampleListSampleDirectoryRedirectButton -> "サンプルディレクトリを変更"
    PrerendererModuleText -> "サブプロジェクトをレンダリング %d/%d..."
    PrerendererModuleTextFinished -> "サブプロジェクトをレンダリング %d/%d... 完了"
    PrerendererSampleTextFinished -> "サンプルファイルをレンダリング %d/%d... 完了"
    PrerendererChartText -> "グラフをレンダリング %d/%d..."
    PrerendererChartTextFinished -> "グラフをレンダリング %d/%d... 完了"
    EditorRenderStatusLabel -> "%d/%d レンダリング中..."
    ChooseSampleDirectoryDialogTitle -> "サンプルディレクトリを選択"
    ChooseWorkingDirectoryDialogTitle -> "プロジェクトファイルの保存先を選択"
    ChooseCacheDirectoryDialogTitle -> "キャッシュディレクトリを選択"
    ChooseInputFileDialogTitle -> "入力ファイルを選択"
    OpenProjectDialogTitle -> "プロジェクトを開く"
    SaveAsProjectDialogTitle -> "プロジェクトを別名で保存"
    ExportDialogTitle -> "プロジェクトをエクスポート"
    SetResolutionDialogDescription -> "エディタのキャンバスの解像度（データ数/ピクセル）を指定してください。(%d ~ %d)"
    AskIfSaveBeforeOpenDialogDescription -> "未保存の変更があります。新しいプロジェクトを開く前に保存しますか？"
    AskIfSaveBeforeExportDialogDescription -> "未保存の変更があります。エクスポートする前に保存しますか？"
    AskIfSaveBeforeCloseDialogDescription -> "未保存の変更があります。プロジェクトを閉じる前に保存しますか？"
    AskIfSaveBeforeExitDialogDescription -> "未保存の変更があります。終了する前に保存しますか？"
    InputEntryNameDialogDescription -> "エントリ名を入力してください"
    InputEntryNameDuplicateDialogDescription -> "新しいエントリ名を入力してください"
    InputEntryNameCutFormerDialogDescription -> "カットで生成する前のエントリの名前を入力してください"
    InputEntryNameCutLatterDialogDescription -> "カットで生成する後のエントリの名前を入力してください"
    EditEntryNameDialogExistingError -> "既に存在するエントリ名です。"
    AskIfRemoveEntryDialogDescription -> "このエントリを削除します。"
    AskIfRemoveEntryLastDialogDescription ->
        "このエントリを削除します。\n" +
            "このエントリはサンプルに紐付けられている唯一のエントリのため、削除すると、サンプルはプロジェクトから消えますが、" +
            "メニュー「表示」->「サンプルリスト」で確認・再度追加できます。"
    AskIfLoadAutoSavedProjectDialogDescription ->
        "自動保存されたプロジェクトファイルが見つかりました。読み込みますか？" +
            "このファイルは、他のプロジェクトを開く・新規作成するときに削除されます。"
    AskIfRedirectSampleDirectoryDialogDescription ->
        "プロジェクトのサンプルディレクトリ(%s)が見つかりません。他のディレクトリに変更しますか？"
    PluginDialogTitle -> "vLabeler - プラグイン"
    PluginDialogInfoAuthor -> "作者：%s"
    PluginDialogInfoVersion -> "バージョン：%d"
    PluginDialogInfoContact -> "作者に連絡"
    PluginDialogDescriptionMin -> "最小値: %s"
    PluginDialogDescriptionMax -> "最大値: %s"
    PluginDialogDescriptionMinMax -> "最小値: %s, 最大値: %s"
    PluginDialogExecute -> "実行"
    PluginEntrySelectorTextMatchTypeEquals -> "完全一致"
    PluginEntrySelectorTextMatchTypeContains -> "部分一致"
    PluginEntrySelectorTextMatchTypeStartsWith -> "前方一致"
    PluginEntrySelectorTextMatchTypeEndsWith -> "後方一致"
    PluginEntrySelectorTextMatchTypeRegex -> "正規表現"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "サンプル名"
    PluginEntrySelectorPreservedSubjectName -> "エントリ名"
    PluginEntrySelectorPreservedSubjectTag -> "タグ"
    PluginEntrySelectorPreservedSubjectDone -> "完了状態"
    PluginEntrySelectorPreservedSubjectStar -> "スターマーク状態"
    PluginEntrySelectorComparerValue -> "入力値"
    PluginEntrySelectorPreviewSummaryError -> "無効な入力値"
    PluginEntrySelectorPreviewSummaryInitializing -> "初期化中..."
    PluginEntrySelectorPreviewSummary -> "選択中 %d/%d"
    PluginEntrySelectorPlaceholder -> "フィルターがないため、全てのエントリが選択されます"
    EditorSubTitleMultiple -> "サンプル %2\$s の中の%1\$dエントリを編集"
    EditorModuleRootNameTitle -> "（ルート）"
    FailedToLoadSampleFileError ->
        "サンプルファイルを読み込めませんでした。存在しないか、サポートされていないフォーマットの可能性があります。"
    EmptySampleDirectoryException -> "プロジェクトを作成できませんでした。サンプルディレクトリにサンプルファイルがありません。"
    PluginRuntimeUnexpectedException -> "プラグインの実行中に予期しないエラーが発生しました。プラグインの作者に連絡してください。"
    InvalidCreatedProjectException -> "作成したプロジェクトは無効です。ラベラーまたはプラグインの作者に連絡してください。"
    InvalidOpenedProjectException -> "プロジェクトを開けませんでした。無効なデータが含まれています。詳細はエラーログを確認してください。"
    ProjectParseException ->
        "プロジェクトを開けませんでした。破損しているか、互換性のないのバージョンの vLabeler によって作られています。"
    ProjectUpdateOnSampleException ->
        "プロジェクトのデータとサンプルのデータをマッチングできませんでした。詳細はエラーログを確認してください。"
    InvalidEditedProjectException -> "この編集は無効です。詳細はエラーログを確認してください。"
    CustomizableItemLoadingException -> "コンポーネントを読み込めませんでした。"
    PluginRuntimeExceptionTemplate -> "プラグインの実行中にエラーが発生しました：%s"
    LabelerManagerTitle -> "ラベラー"
    LabelerManagerImportDialogTitle -> "ラベラーをインポート"
    TemplatePluginManagerTitle -> "テンプレート生成器"
    TemplatePluginManagerImportDialogTitle -> "テンプレート生成器をインポート"
    MacroPluginManagerTitle -> "バッチ編集プラグイン"
    MacroPluginManagerImportDialogTitle -> "バッチ編集プラグインをインポート"
    MacroPluginReportDialogTitle -> "バッチ編集の実行結果"
    MacroPluginReportDialogCopy -> "コピー"
    CustomizableItemManagerRemoveItemConfirm -> "「%s」を削除しますか？削除されたファイルは元に戻せません。"
    CustomizableItemManagerOpenDirectory -> "ディレクトリを開く"
    CustomizableItemManagerReload -> "再読み込み"
    CustomizableItemManagerLockedDescription -> "このコンポーネントは Built-in のため、削除できません。"
    PreferencesEditorImport -> "インポート"
    PreferencesEditorImportDialogTitle -> "設定をインポート"
    PreferencesEditorImportSuccess -> "設定をインポートしました。"
    PreferencesEditorImportFailure -> "設定をインポートできませんでした。"
    PreferencesEditorExport -> "エクスポート"
    PreferencesEditorExportSuccess -> "設定をエクスポートしました。"
    PreferencesEditorExportFailure -> "指定されたファイルに設定をエクスポートできませんでした。"
    PreferencesEditorExportDialogTitle -> "設定をエクスポート"
    PreferencesEditorResetPage -> "このページの設定をリセット"
    PreferencesEditorResetAll -> "すべての設定をリセット"
    PreferencesCharts -> "グラフ"
    PreferencesChartsDescription -> "グラフの描画・表示を編集します。"
    PreferencesChartsCanvas -> "キャンバス"
    PreferencesChartsCanvasDescription -> "キャンバスの基本設定を編集します。"
    PreferencesChartsCanvasResolution -> "キャンバス解像度"
    PreferencesChartsCanvasResolutionDescription ->
        "1ピクセルあたりのデータポイントの数。この値はスクリーンに表示される時間範囲の幅に比例します。"
    PreferencesChartsCanvasResolutionDefault -> "デフォルト値"
    PreferencesChartsCanvasResolutionStep -> "ステップ"
    PreferencesChartsMaxDataChunkSize -> "最大データチャンクサイズ"
    PreferencesChartsMaxDataChunkSizeDescription ->
        "グラフチャンクの最大サイズ。この値が大きいほど、グラフが少ないチャンクに分割されます。"
    PreferencesChartsWaveform -> "波形"
    PreferencesChartsWaveformDescription -> "波形の描画設定を編集します。"
    PreferencesChartsWaveformResampleDownTo -> "最大サンプリングレート（Hz）"
    PreferencesChartsWaveformResampleDownToDescription ->
        "この値より大きいサンプリングレートの音声ファイルを読み込むときは、" +
            "この値にリサンプリングしてから行います（元のファイルは編集されません）。0に設定すると、リサンプリングは行われません。"
    PreferencesChartsWaveformNormalize -> "音声正規化"
    PreferencesChartsWaveformNormalizeDescription -> "正規化を有効にすると、最初にサンプルを読み込むときに時間がかかります。"
    PreferencesChartsWaveformUnitSize -> "ポイント数/ピクセル"
    PreferencesChartsWaveformUnitSizeDescription -> "この値を大きくすると、グラフの描画は高速になりますが、品質は低下します。"
    PreferencesChartsWaveformIntensityAccuracy -> "波形の高さ（ピクセル）"
    PreferencesChartsWaveformYAxisBlankRate -> "縦向きの空白割合（%%）"
    PreferencesChartsWaveformColor -> "波形の色"
    PreferencesChartsWaveformBackgroundColor -> "背景の色"
    PreferencesChartsSpectrogram -> "スペクトログラム"
    PreferencesChartsSpectrogramDescription -> "スペクトログラムの描画設定を編集します。"
    PreferencesChartsSpectrogramEnabled -> "スペクトログラムを表示"
    PreferencesChartsSpectrogramHeight -> "波形グラフの高さに対する高さの割合（%%）"
    PreferencesChartsSpectrogramPointDensity -> "ポイント数/ピクセル"
    PreferencesChartsSpectrogramPointDensityDescription -> "この値を大きくすると、グラフの描画は高速になりますが、品質は低下します。"
    PreferencesChartsSpectrogramHopSize -> "FFT ホップサイズ"
    PreferencesChartsSpectrogramHopSizeDescription ->
        "この設定の値は基準値です。実際の音声ファイルのサンプリングレートによって調整されます。"
    PreferencesChartsSpectrogramWindowSize -> "FFT ウィンドウサイズ"
    PreferencesChartsSpectrogramWindowSizeDescription ->
        "この設定の値は基準値です。実際の音声ファイルのサンプリングレートによって調整されます。"
    PreferencesChartsSpectrogramMelScaleStep -> "周波数ステップ（mel）"
    PreferencesChartsSpectrogramMaxFrequency -> "最高周波数（Hz）"
    PreferencesChartsSpectrogramMinIntensity -> "最小強度（dB）"
    PreferencesChartsSpectrogramMaxIntensity -> "最大強度（dB）"
    PreferencesChartsSpectrogramWindowType -> "ウィンドウ関数"
    PreferencesChartsSpectrogramColorPalette -> "配色"
    PreferencesKeymap -> "キーマップ"
    PreferencesKeymapDescription -> "キーボード/マウス操作のキーマップを編集します。"
    PreferencesKeymapKeyAction -> "キーボード操作"
    PreferencesKeymapKeyActionDescription -> "キーボード操作のキーマップを編集します。"
    PreferencesKeymapMouseClickAction -> "マウスクリック操作"
    PreferencesKeymapMouseClickActionDescription ->
        "マウスクリック操作のキーマップを編集します。これらの操作は、対応するキーがすべて押されたときにのみトリガーされます。"
    PreferencesKeymapMouseScrollAction -> "マウススクロール操作"
    PreferencesKeymapMouseScrollActionDescription ->
        "マウススクロール操作のキーマップを編集します。これらの操作は、対応するキーがすべて押されたときにのみトリガーされます。"
    PreferencesKeymapEditDialogTitle -> "キーマップを編集："
    PreferencesKeymapEditDialogDescriptionMouseClick -> "この入力欄を左クリック/右クリックで入力します。"
    PreferencesKeymapEditDialogDescriptionMouseScroll -> "この入力欄を上にマウスホイールで入力します。"
    PreferencesKeymapEditDialogConflictingLabel -> "すでに他の操作で使用されています："
    PreferencesKeymapEditDialogConflictingWarning ->
        "このキーセットは他の操作で使用されています。他の操作で使用されているキーセットを削除しますか？"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "削除しない"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "削除する"
    PreferencesView -> "表示"
    PreferencesViewDescription -> "アプリケーションの表示を編集します。"
    PreferencesViewLanguage -> "言語"
    PreferencesViewHideSampleExtension -> "サンプル名の拡張子を隠す"
    PreferencesViewAppAccentColor -> "アプリケーションのアクセント色（ライト）"
    PreferencesViewAppAccentColorVariant -> "アプリケーションのアクセント色（ダーク）"
    PreferencesViewPinnedEntryListPosition -> "ピン留めされたエントリリストの位置"
    PreferencesViewPositionLeft -> "左側"
    PreferencesViewPositionRight -> "右側"
    PreferencesViewPositionTop -> "上部"
    PreferencesViewPositionBottom -> "下部"
    PreferencesViewCornerPositionTopLeft -> "左上"
    PreferencesViewCornerPositionTopRight -> "右上"
    PreferencesViewCornerPositionBottomLeft -> "左下"
    PreferencesViewCornerPositionBottomRight -> "右下"
    PreferencesFontSizeSmall -> "小"
    PreferencesFontSizeMedium -> "中"
    PreferencesFontSizeLarge -> "大"
    PreferencesEditor -> "エディタ"
    PreferencesEditorDescription -> "エディタの表示と動作を編集します。"
    PreferencesEditorPlayerCursorColor -> "プレイヤーのカーソルの色"
    PreferencesEditorPlayerLockedDrag -> "連動ドラッグ"
    PreferencesEditorPlayerLockedDragDescription ->
        "連動ラッグを有効にする条件を選択します。" +
            "連動ドラッグが有効な場合、他のパラメータはドラッグするパラメータに合わせて、それらの相対位置を保つように移動します。"
    PreferencesEditorPlayerLockedDragUseLabeler -> "ラベラーに従う"
    PreferencesEditorPlayerLockedDragUseStart -> "開始位置をドラッグするとき"
    PreferencesEditorPlayerLockedDragNever -> "有効にしない"
    PreferencesEditorNotes -> "備考"
    PreferencesEditorNotesDescription -> "エントリの備考（スターマーク、完了、タグ）に関する表示と動作を編集します。"
    PreferencesEditorShowDone -> "\"完了\"状態を表示"
    PreferencesEditorAutoDone -> "自動的に編集されたエントリを\"完了\"に設定する"
    PreferencesEditorShowStarred -> "\"スターマーク\"状態を表示"
    PreferencesEditorShowTag -> "タグを表示"
    PreferencesEditorScissors -> "はさみ"
    PreferencesEditorScissorsDescription -> "はさみツールに関する表示と動作を編集します。"
    PreferencesEditorScissorsColor -> "色"
    PreferencesEditorScissorsActionTargetNone -> "なし"
    PreferencesEditorScissorsActionTargetFormer -> "前のエントリ"
    PreferencesEditorScissorsActionTargetLatter -> "後のエントリ"
    PreferencesEditorScissorsActionGoTo -> "カット後の移動先"
    PreferencesEditorScissorsActionAskForName -> "カット後のリネーム対象"
    PreferencesEditorScissorsActionPlay -> "カット時の再生対象"
    PreferencesEditorAutoScroll -> "自動スクロール"
    PreferencesEditorAutoScrollDescription -> "自動スクロールする条件を選択します。"
    PreferencesEditorAutoScrollOnLoadedNewSample -> "サンプルを切り替えた時"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "インデックスによりエントリに移動した時"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "複数エントリ編集モードでエントリを切り替えた時"
    PreferencesEditorAutoScrollOnSwitched -> "エントリを切り替えた時"
    PreferencesEditorContinuousLabelNames -> "ラベル名（連続）"
    PreferencesEditorContinuousLabelNamesDescription -> "連続のラベラーを使用している時にエディタに表示されるラベル名のスタイルを編集します。"
    PreferencesEditorContinuousLabelNamesColor -> "色"
    PreferencesEditorContinuousLabelNamesSize -> "サイズ"
    PreferencesEditorContinuousLabelNamesPosition -> "位置"
    PreferencesPlayback -> "再生"
    PreferencesPlaybackDescription -> "音声再生の動作を編集します。"
    PreferencesPlaybackPlayOnDragging -> "プレビュー再生"
    PreferencesPlaybackPlayOnDraggingDescription ->
        "プレビュー再生の操作（キーマップ参照）でパラメータをドラッグすると、その線の近くの音声をプレビュー再生します。"
    PreferencesPlaybackPlayOnDraggingEnabled -> "有効"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "再生範囲の半径（ミリ秒）"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "ドラッグイベントのキューサイズ"
    PreferencesAutoSave -> "自動保存"
    PreferencesAutoSaveDescription -> "プロジェクトんｐ自動保存の動作を編集します。"
    PreferencesAutoSaveTarget -> "保存先"
    PreferencesAutoSaveTargetNone -> "なし"
    PreferencesAutoSaveTargetProject -> "プロジェクトファイルに上書き"
    PreferencesAutoSaveTargetRecord -> "一時ファイル"
    PreferencesAutoSaveIntervalSec -> "自動保存間隔（秒）"
    PreferencesHistory -> "操作履歴"
    PreferencesHistoryDescription -> "操作履歴（取り消し、やり直し）に関するの動作を編集します。"
    PreferencesHistoryMaxSize -> "保存される最大操作数"
    PreferencesHistorySquashIndex -> "インデックスのみの変更を圧縮する"
    PreferencesHistorySquashIndexDescription ->
        "有効にすると、インデックスのみの変更（エントリの切り替えなど）は、" +
            "次に内容の変更があるまで、履歴に保存されません。"
    ActionToggleSamplePlayback -> "現在のサンプルの再生/停止"
    ActionToggleEntryPlayback -> "現在のエントリの再生/停止"
    ActionIncreaseResolution -> "ズームアウト"
    ActionDecreaseResolution -> "ズームイン"
    ActionInputResolution -> "キャンパス解像度を入力"
    ActionCancelDialog -> "ダイアログを閉じる"
    ActionSetValue1 -> "パラメータ1をカーソル位置に設定"
    ActionSetValue2 -> "パラメータ2をカーソル位置に設定"
    ActionSetValue3 -> "パラメータ3をカーソル位置に設定"
    ActionSetValue4 -> "パラメータ4をカーソル位置に設定"
    ActionSetValue5 -> "パラメータ5をカーソル位置に設定"
    ActionSetValue6 -> "パラメータ6をカーソル位置に設定"
    ActionSetValue7 -> "パラメータ7をカーソル位置に設定"
    ActionSetValue8 -> "パラメータ8をカーソル位置に設定"
    ActionSetValue9 -> "パラメータ9をカーソル位置に設定"
    ActionSetValue10 -> "パラメータ10をカーソル位置に設定"
    ActionMoveParameter -> "パラメータラインをドラッグ"
    ActionMoveParameterWithPlaybackPreview -> "パラメータラインをドラッグ（プレビュー再生）"
    ActionMoveParameterIgnoringConstraints -> "パラメータラインをドラッグ（制約を無視）"
    ActionMoveParameterInvertingLocked -> "パラメータラインをドラッグ（連動ドラグ設定を反転）"
    ActionPlayAudioSection -> "クリック位置の音声を再生"
    ActionScrollCanvasLeft -> "キャンパスを左にスクロール"
    ActionScrollCanvasRight -> "キャンパスを右にスクロール"
    ActionZoomInCanvas -> "ズームイン"
    ActionZoomOutCanvas -> "ズームアウト"
    ActionGoToNextEntry -> "次のエントリ"
    ActionGoToPreviousEntry -> "前のエントリ"
    ActionGoToNextSample -> "次のサンプル"
    ActionGoToPreviousSample -> "前のサンプル"
    CheckForUpdatesAlreadyUpdated -> "すでに最新のバージョンがインストールされています。"
    CheckForUpdatesFailure -> "アップデートの確認に失敗しました。"
    UpdaterDialogSummaryDetailsLink -> "詳細"
    UpdaterDialogTitle -> "vLabeler - アップデートの確認"
    UpdaterDialogCurrentVersionLabel -> "今のバージョン：%s"
    UpdaterDialogLatestVersionLabel -> "最新のバージョン：%s (%s)"
    UpdaterDialogStartDownloadButton -> "ダウンロード"
    UpdaterDialogIgnoreButton -> "このバージョンを無視"
    UpdaterDialogDownloadPositionLabel -> "保存先："
    UpdaterDialogChangeDownloadPositionButton -> "変更"
    UpdaterDialogChooseDownloadPositionDialogTitle -> "保存先を選択"
    AboutDialogTitle -> "vLabeler について"
    AboutDialogCopyInfo -> "情報をコピー"
    AboutDialogShowLicenses -> "ライセンスを表示"
    LicenseDialogTitle -> "vLabeler - ライセンス"
    LicenseDialogLicenses -> "vLabeler が使用しているライブラリのライセンス"
    LoadProjectWarningLabelerCreated -> "プロジェクトファイルにより新しいラベラー `%s`をインストールしました。"
    LoadProjectWarningLabelerUpdated -> "プロジェクトファイルによりラベラー `%1\$s` を `%2\$s` にアップデートしました。"
    LoadProjectWarningCacheDirReset ->
        "プロジェクトファイルで指定されたキャッシュディレクトリを参照・作成できませんでした。デフォルトのキャッシュディレクトリを使用します。"
    FilterStarred -> "スターマークのあるエントリのみ表示"
    FilterUnstarred -> "スターマークのないエントリのみ表示"
    FilterStarIgnored -> "スターマークを参照しない"
    FilterDone -> "完成のエントリのみ表示"
    FilterUndone -> "未完成のエントリのみ表示"
    FilterDoneIgnored -> "完成状態を参照しない"
    FilterLink -> "フィルターをプロジェクトのナビゲーションにも使う"
    FilterLinked -> "フィルターはプロジェクトのナビゲーションにも使かわれている"
    ColorPickerDialogTitle -> "vLabeler - カラーピッカー"
    else -> null
}
