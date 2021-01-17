package tictactoe

import java.util.*

fun printCurrentBoard(_1x1: Char, _1x2:Char, _1x3:Char, _2x1:Char, _2x2:Char, _2x3:Char, _3x1:Char, _3x2:Char, _3x3:Char) {

    println("---------")
    println("| $_1x1 $_1x2 $_1x3 |")
    println("| $_2x1 $_2x2 $_2x3 |")
    println("| $_3x1 $_3x2 $_3x3 |")
    println("---------")
}

fun main() {

    //Get starting stage of board
    val scn = Scanner(System.`in`)

    println("Enter cells: ")

    var _1x1: Char = ' '
    var _1x2: Char = ' '
    var _1x3: Char = ' '

    var _2x1: Char = ' '
    var _2x2: Char = ' '
    var _2x3: Char = ' '

    var _3x1: Char = ' '
    var _3x2: Char = ' '
    var _3x3: Char = ' '

    // print first board
    printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)

    // init of var for condition validation
    var wins = 0
    var X = 0
    var O = 0

    // print board as long as no wincondition is met
    while (wins == 0) {

        // asks for next coordinates
        print("Enter the coordinates: ")
        val newCoordinateToAdd: String = scn.nextLine()
        val errorOccupied = "This cell is occupied! Choose another one!"
        val errorNotOfCorrectType = "You should enter numbers"
        val errorOutsideRange = "Coordinates should be from 1 to 3!"
        var noErrors = false
        var turnX = true
        var turnO = true

        // checks if user input is valid and sets noErrors to true else prints error messages
        when (newCoordinateToAdd) {
            "1 1" -> if (_1x1 == ' ' && turnX == true) {
                _1x1 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_1x1 == ' ' && turnO == true) {
                _1x1 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "1 2" -> if (_1x2 == ' ' && turnX == true) {
                _1x2 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_1x2 == ' ' && turnO == true) {
                _1x2 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "1 3" -> if (_1x3 == ' ' && turnX == true) {
                _1x3 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_1x3 == ' ' && turnO == true) {
                _1x3 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "2 1" -> if (_2x1 == ' ' && turnX == true) {
                _2x1 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_2x1 == ' ' && turnO == true) {
                _2x1 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "2 2" -> if (_2x2 == ' ' && turnX == true) {
                _2x2 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_2x2 == ' ' && turnO == true) {
                _2x2 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "2 3" -> if (_2x3 == ' ' && turnX == true) {
                _2x3 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_2x3 == ' ' && turnO == true) {
                _2x3 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "3 1" -> if (_3x1 == ' ' && turnX == true) {
                _3x1 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_3x1 == ' ' && turnO == true) {
                _3x1 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "3 2" -> if (_3x2 == ' ' && turnX == true) {
                _3x2 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_3x2 == ' ' && turnO == true) {
                _3x2 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            "3 3" -> if (_3x3 == ' ' && turnX == true) {
                _3x3 = 'X'
                noErrors = true
                turnO = true
                turnX = false
            } else if (_3x3 == ' ' && turnO == true) {
                _3x3 = 'O'
                noErrors = true
                turnO = false
                turnX = true
            } else println(errorOccupied)
            else -> if (newCoordinateToAdd[0] > '3' || newCoordinateToAdd[2] > '3') {
                println(errorOutsideRange)
            } else println(errorNotOfCorrectType)
        }
        // prints board if validation above is true
        if (noErrors) {
            printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)
        }

        // Win conditions
        val topHorWin = _1x1 == _1x2 && _1x1 == _1x3 && _1x1 != ' '
        val midHorWin = _2x1 == _2x2 && _2x1 == _2x3 && _2x1 != ' '
        val dowHorWin = _3x1 == _3x2 && _3x1 == _3x3 && _3x1 != ' '

        val lefDowWin = _1x1 == _2x1 && _1x1 == _3x1 && _1x1 != ' '
        val midDowWin = _1x2 == _2x2 && _1x2 == _3x2 && _1x2 != ' '
        val rigDowWin = _1x3 == _2x3 && _1x3 == _3x3 && _1x3 != ' '

        val sideWayWinLeftToRight = _1x1 == _2x2 && _1x1 == _3x3 && _1x1 != ' '
        val sideWayWinRightToLeft = _1x3 == _2x2 && _1x3 == _3x1 && _1x3 != ' '

        // check conditions
        val winConditions = booleanArrayOf(
            topHorWin, midHorWin, dowHorWin, lefDowWin, midDowWin,
            rigDowWin, sideWayWinLeftToRight, sideWayWinRightToLeft
        )

        for (win in winConditions) {
            if (win) {
                wins++
            }
        }

//         prints out correct conditions
        if (wins > 1 || X - O > 1 || O - X > 1) {
            println("Impossible")
        } else if (topHorWin || sideWayWinLeftToRight || lefDowWin) {
            println("$_1x1 wins")
        } else if (midHorWin) {
            println("$_2x1 wins")
        } else if (dowHorWin) {
            println("$_3x1 wins")
        } else if (sideWayWinRightToLeft || rigDowWin) {
            println("$_1x3 wins")
        } else if (midDowWin) {
            println("$_1x2 wins")
        }
    }
}