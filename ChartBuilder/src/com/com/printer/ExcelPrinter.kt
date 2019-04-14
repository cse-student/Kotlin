package com.com.printer

import com.dataclass.Session
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream

class ExcelPrinter {
    companion object {
        fun print(workout: String, month: Int, sessions: MutableList<Session>){
            val filepath = "./Files/$workout M$month.xlsx"
            //Instantiate Excel workbook:
            val xlWb = XSSFWorkbook()
            //Instantiate Excel worksheet:
            val xlWs = xlWb.createSheet()
            val outputStream = FileOutputStream(filepath)
            //Row index specifies the row in the worksheet (starting at 0):
            var rowNumber = 0
            //Cell index specifies the column within the chosen row (starting at 0):
            var columnNumber = 0
            for (session in sessions) {
                columnNumber = 0
                //Write Week number
                val weekRow = xlWs.createRow(rowNumber)
                val weekCol = weekRow.createCell(columnNumber)
                weekCol.setCellValue("WEEK ${session.sessionNumber}")
                rowNumber++
                columnNumber = 1
                //Print Sets
                for (set in session.sets){
                    var setRow = xlWs.createRow(rowNumber)
                    var setCol = setRow.createCell(columnNumber)
                    setCol.setCellValue("SET ${set.setNumber}")
                    columnNumber++
                    setCol = setRow.createCell(columnNumber)
                    setCol.setCellValue("${set.weight} x ${set.reps}")
                    columnNumber--
                    rowNumber++
                }
                rowNumber += 2
            }
            //Write file:
            xlWb.write(outputStream)
            xlWb.close()
        }
    }
}