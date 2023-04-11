package sk.stuba.fei.uim.oop.game.pipes.board.pipes;

public class EmptyPipe extends BasePipe {

    {
        this.path = "temp//EmptyPipe.png";
        this.pathDark = "temp//EmptyPipe_dark.png";
    }

    public EmptyPipe(int cellWidth, int cellHeight) {
        super(cellWidth, cellHeight);
        this.setImg();
    }

    public EmptyPipe() {
        super();
    }

}
