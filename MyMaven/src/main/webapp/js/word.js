/**
 * Created by SDL on 2015/5/6.
 */
function wordcontorl() {
    alert("1111")
    var WordApp = new ActiveXObject("Word.Application");
    var wdCharacter = 1
    var wdOrientLandscape = 1
    WordApp.Application.Visible = true;
    var myDoc = WordApp.Documents.Add();
    WordApp.ActiveDocument.PageSetup.Orientation = wdOrientLandscape
    WordApp.Selection.ParagraphFormat.Alignment = 1 //1居中对齐,0为居右
    WordApp.Selection.Font.Bold = true
    WordApp.Selection.Font.Size = 20
    WordApp.Selection.TypeText("我的标题");
    WordApp.Selection.MoveRight(wdCharacter);　　　　//光标右移字符
    WordApp.Selection.TypeParagraph()　　　　　　　　　//插入段落
    WordApp.Selection.Font.Size = 12
    WordApp.Selection.TypeText("副标题"); //分行插入日期
    WordApp.Selection.TypeParagraph()　　　　　　　　　//插入段落
    var myTable = myDoc.Tables.Add(WordApp.Selection.Range, 8, 7) //8行7列的表格
//myTable.Style="网格型"
    var aa = "我的列标题"
    var TableRange; //以下为给表格中的单元格赋值
    for (i = 0; i < 7; i++) {
        with (myTable.Cell(1, i + 1).Range) {
            font.Size = 12;
            InsertAfter(aa);
            ColumnWidth = 4
        }
    }
    for (i = 0; i < 7; i++) {
        for (n = 0; n < 7; n++) {
            with (myTable.Cell(i + 2, n + 1).Range) {
                font.Size = 12;
                InsertAfter("bbbb");
            }
        }
    }
    row_count = 0;
    col_count = 0;
    myDoc.Protect(1);
}
