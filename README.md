# mine-sweeper
Mine sweeper game with a simple UI

Hyperskill project "Minesweeper" (Java Developer). Stage 5/5.

User enters row-number and colmun-number followed by 'free' to clear out the game board.
To mark a cell as a potential mine, input row- and column number again, followed by 'mine'. 

Examle: "5 5 free" -> frees up every cell without a mine. "5 5 mine" -> marks a cell as a potential mine location. 

'*': Mine marker.

'.': Unexplored cell.

'/': Explored cell that has no mines around it.

'X': Mine, you loose!

A number: Indicates number of mines lying in the vicinity of the specific cell. 
