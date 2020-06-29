package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class LimeGlazedTerracotta {
	public static void initStates() {
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9394, "facing=north"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9395, "facing=south"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9396, "facing=west"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9397, "facing=east"));
	}
}
