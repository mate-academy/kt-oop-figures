# OOP Figures

💡 Solve this task using OOP principles

Some figures are of the following types: square, rectangle, right triangle, circle, and isosceles trapezoid. You need to create corresponding classes for them: `Square`, `Rectangle`, `RightTriangle`, `Circle`, and `IsoscelesTrapezoid`.

All figures have:

- **state** — all figures have `color`, but each figure type can also have one or several unique properties (`radius` for circle, `firstLeg` and `secondLeg` for right triangle, and so on).
- **behavior** — we can obtain the area of any figure and can "draw" it.  "Draw" means to print out all information about a figure using `println()` (**do not** override the `toString()` function for this).

💡 Think where you should declare these fields and functions: top-level class/interface/bottom-level classes.

In the `main()` function, create an array of figures (the array size can be 4 or 6, it doesn't matter):

- **The first half** of figures in this array should be generated with random parameters. For this purpose, create a `FigureSupplier` class with a `fun getRandomFigure(): Figure` function to generate figures with random properties. Also, you should use the existing `ColorSupplier` class with the `fun getRandomColor(): Color` function to generate random colors. The color enum is already present in the repo.

- **The second half** of the figures should have the same default parameters. For this purpose create a new function in the `FigureSupplier` class: `fun getDefaultFigure(): Figure`. This function should always return a white circle with a radius `10`.

After generating the array, display the entire list of objects that you have, for example:

```
Figure: square, area: 25.0 sq. units, side: 5 units, color: blue
Figure: triangle, area: 12.5 sq. units, firstLeg: 7 units, secondLeg: 5 units, color: yellow
```
