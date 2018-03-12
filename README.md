# Conway's Game of Life

- [History](#history)
- [Explication](#explication)
- [Examples](#examples)

## History
The Game of Life is a cellular automaton devised by the British mathematician John Horton Conway in 1970.

The "game" is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves, or, for advanced "players", by creating patterns with particular properties. ( -Wikipedia)

## Explication (Rules)

* Any *live* cell with < (fewer than) 2 *live* neighbours dies (as if caused by **underpopulation**)
* Any *live* cell with 2 or 3 live neighbours lives on to the next generation.
* Any *live* cell with > (more than) 3 *live* neighbours dies (as if by **overpopulation**)
* Any *dead* cell with == (exactly) 3 *live* neighbours becomes a *live* cell (as if by **reproduction**)


## Examples
![Conway_First_Example](https://image.ibb.co/kwzSL7/eins.png)
