# SC-IM
[sc-im](https://github.com/andmarti1424/sc-im) is an ncurses based, vim-like spreadsheet calculator based on sc.

## DESCRIPTION
Introductory sc-im tutorial.

## INSTRUCTIONS
Open files with sc-im eg. 
  `sc-im 'Lesson1 - Navigation.sc'`

or 

run the whole tutorial
```bash
for f in *; do
  sc-im "$f"
done

```

```nushell
for f in ( ls | sort-by name) { 
  sc-im $f.name 
}
```

### LESSONS

0. Lesson00 - General commands and shortcuts in sc-im
1. Lesson01 - Navigation
2. Lesson02 - Formatting cell contents
3. Lesson03 - Copy, Paste, Cut basics
4. Lesson04 - Copy, Paste, Cut
5. Lesson05 - Marks
6. Lesson06 - Sc-im Modes
7. Lesson07 - Insert and Edit Mode
8. Lesson08 - Visual Mode
9. Lesson09 - Command Mode
10. Lesson10 - Configuration File
11. Lesson11 - Numeric Functions
12. Lesson12 - String Functions
13. Lesson13 - Date Functions
14. Lesson14 - Conditional Function "if"
