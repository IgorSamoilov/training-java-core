package lesson7.task3.Figures;

import lesson7.task3.chess.Chess;
import lesson7.task3.chess.Player;
import lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bishop extends ChessFigure {

    public Bishop(Player player, String position) {
        super(player, position);
        figureType = "Слон";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0) continue;
            if (dx == dy)
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}