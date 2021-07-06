package lesson7.task3;

import lesson7.task3.Figures.*;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new King(Player.BLACK, "E8"));
        figures.add(new Queen(Player.BLACK, "D8"));
        figures.add(new Rook(Player.BLACK, "H8"));
        figures.add(new Knight(Player.BLACK, "B8"));
        figures.add(new Bishop(Player.BLACK, "C8"));
        figures.add(new Pawn(Player.WHITE, "A2"));
        figures.add(new Pawn(Player.WHITE, "B2"));
        figures.add(new Pawn(Player.WHITE, "C2"));
        figures.add(new Pawn(Player.WHITE, "D2"));
        figures.add(new Pawn(Player.WHITE, "E2"));
        figures.add(new Pawn(Player.WHITE, "F2"));
        figures.add(new Pawn(Player.WHITE, "G2"));
        figures.add(new Pawn(Player.WHITE, "H2"));

        for (ChessFigure figure : figures)
            printMoves(figure);
    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }

}