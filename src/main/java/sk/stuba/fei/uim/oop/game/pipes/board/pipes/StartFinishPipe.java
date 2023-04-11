package sk.stuba.fei.uim.oop.game.pipes.board.pipes;

public class StartFinishPipe extends BasePipe {

    {
        this.path = "temp//StartFinishPipe.png";
    }

    public StartFinishPipe(int cellWidth, int cellHeight) {
        super(cellWidth, cellHeight);
        this.setImg();
    }

    public StartFinishPipe() {
        super();
    }
}