# This data file was generated by the Spreadsheet Calculator Improvised (sc-im)
# You almost certainly shouldn't edit it.

newsheet "Sheet1"
movetosheet "Sheet1"
format A 55 2 0
format 2 3
format 4 3
format 6 3
format 9 6
format 11 6
leftstring A0 = "1. Go to C0. Press = 1 and press enter"
let G0 = 1
leftstring A2 = "2. Go to C2. Press <scim and press enter.\n NOTE: INSERT A LEFT JUSTIFIED STRING"
leftstring G2 = "scim"
leftstring A4 = "3. Go to C4. Press \scim and press enter.\n NOTE: INSERT A CENTERED LABEL OR STRING"
label G4 = "scim"
leftstring A6 = "4. Go to C6. Press >scim and press enter.\n NOTE: INSERT A RIGHT JUSTIFIED LABEL OR STRING"
rightstring G6 = "scim"
leftstring A9 = "5. Go to C0. Press e to edit a numerical value.\n NOTE: When you press e you will enter EDIT MODE.\n  Press i, =, I, or A to enter INSERT MODE and edit\n  the value.\n  EXPERIMENT TO SEE DIFFERENCE."
leftstring A11 = "5. Go to C2. Press E to edit a text value.\n NOTE: When you press E you will enter EDIT MODE.\n  Press i, =, I, or A to enter INSERT MODE and edit\n  the value.\n  EXPERIMENT TO SEE DIFFERENCE."
cellcolor C0 "fg=BLACK bg=RED"
cellcolor C2 "fg=BLACK bg=RED"
cellcolor C4 "fg=BLACK bg=RED"
cellcolor C6 "fg=BLACK bg=RED"
goto A0