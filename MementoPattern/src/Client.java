public class Client {
    public static void main(String[] args) {
        OriginatorChess chess = new OriginatorChess(new MementoChess("黑", 2, 2));
        play(chess);
        chess.SetX(3);
        play(chess);
        chess.SetY(6);
        play(chess);
        undo(chess);
        undo(chess);
        redo(chess);
        redo(chess);
    }


    private static int index = 0;
    private static CaretakerChess caretaker = new CaretakerChess();

    public static void play(OriginatorChess chess) {
        index++;
        caretaker.AddMen(chess.SavetoMemento());
        chess.Show();
    }

    public static void undo(OriginatorChess chess) {
        System.out.println("**********悔棋************");
        index--;
        chess.Restore(caretaker.getMen(index - 1));
        chess.Show();
    }

    public static void redo(OriginatorChess chess) {
        System.out.println("**********撤销悔棋************");
        chess.Restore(caretaker.getMen(index));
        index++;
        chess.Show();
    }
}
