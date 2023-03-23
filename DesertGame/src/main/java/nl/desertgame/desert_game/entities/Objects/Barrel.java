package nl.desertgame.desert_game.entities.Objects;

import javafx.scene.Node;
import nl.desertgame.desert_game.entities.Object;

import java.util.Optional;

public class Barrel implements Object {
    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
