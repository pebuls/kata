
public class BoardTest {

    @Test
    public void aSingleCellShouldHaveZeroNeighbors() throws Exception {

        Board board = new Board();
        board.addCell(new Cell(0, 0));

        Set<Cell> neighbors = board.getNeighbors(new Cell(0, 0));

        assertEquals(0, neighbors.size());
    }
}
