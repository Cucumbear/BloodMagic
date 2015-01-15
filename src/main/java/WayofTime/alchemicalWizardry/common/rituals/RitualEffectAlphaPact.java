package WayofTime.alchemicalWizardry.common.rituals;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.World;
import WayofTime.alchemicalWizardry.api.rituals.IMasterRitualStone;
import WayofTime.alchemicalWizardry.api.rituals.RitualComponent;
import WayofTime.alchemicalWizardry.api.rituals.RitualEffect;
import WayofTime.alchemicalWizardry.api.soulNetwork.SoulNetworkHandler;

public class RitualEffectAlphaPact extends RitualEffect
{
    @Override
    public void performEffect(IMasterRitualStone ritualStone)
    {
        String owner = ritualStone.getOwner();

        int currentEssence = SoulNetworkHandler.getCurrentEssence(owner);
        World world = ritualStone.getWorld();
        int x = ritualStone.getXCoord();
        int y = ritualStone.getYCoord();
        int z = ritualStone.getZCoord();

        if (world.getWorldTime() % 20 != 0)
        {
            return;
        }
        
        
    }

    @Override
    public int getCostPerRefresh()
    {
        return 1;
    }

    @Override
    public List<RitualComponent> getRitualComponentList()
    {
        ArrayList<RitualComponent> omegaRitual = new ArrayList();
        
        this.addCornerRunes(omegaRitual, 1, 0, RitualComponent.BLANK);
        this.addOffsetRunes(omegaRitual, 2, 1, 0, RitualComponent.DUSK);
        this.addParallelRunes(omegaRitual, 4, 0, RitualComponent.WATER);
        this.addParallelRunes(omegaRitual, 5, 0, RitualComponent.EARTH);
        this.addCornerRunes(omegaRitual, 4, 0, RitualComponent.AIR);
        this.addOffsetRunes(omegaRitual, 3, 4, 0, RitualComponent.AIR);
        this.addParallelRunes(omegaRitual, 5, 1, RitualComponent.WATER);
        this.addParallelRunes(omegaRitual, 5, 2, RitualComponent.EARTH);
        this.addParallelRunes(omegaRitual, 4, 3, RitualComponent.WATER);
        this.addParallelRunes(omegaRitual, 4, 4, RitualComponent.WATER);
        this.addParallelRunes(omegaRitual, 3, 5, RitualComponent.BLANK);
        this.addParallelRunes(omegaRitual, 2, 5, RitualComponent.FIRE);
        this.addParallelRunes(omegaRitual, 1, 5, RitualComponent.DUSK);
        this.addOffsetRunes(omegaRitual, 5, 3, 1, RitualComponent.WATER);
        this.addOffsetRunes(omegaRitual, 6, 3, 1, RitualComponent.DUSK);
        this.addOffsetRunes(omegaRitual, 6, 4, 1, RitualComponent.FIRE);
        this.addOffsetRunes(omegaRitual, 6, 5, 1, RitualComponent.BLANK);
        this.addCornerRunes(omegaRitual, 4, 2, RitualComponent.FIRE);
        this.addCornerRunes(omegaRitual, 4, 3, RitualComponent.AIR);
        this.addCornerRunes(omegaRitual, 4, 4, RitualComponent.AIR);
        this.addOffsetRunes(omegaRitual, 4, 3, 2, RitualComponent.BLANK);
        this.addCornerRunes(omegaRitual, 3, 5, RitualComponent.EARTH);
        this.addOffsetRunes(omegaRitual, 2, 3, 5, RitualComponent.AIR);

        return omegaRitual;
    }
}
