package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class BlueWallBanner {
	public static void initStates() {
		BLUE_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8197, "facing=north"));
		BLUE_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8198, "facing=south"));
		BLUE_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8199, "facing=west"));
		BLUE_WALL_BANNER.addBlockAlternative(new BlockAlternative((short) 8200, "facing=east"));
	}
}
