package foundry.alembic;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class AlembicAPI {
    private static final List<String> DAMAGE_TYPES = new ArrayList<>();

    public static final DamageSource SOUL_FIRE = new DamageSource("SOUL_FIRE");
    public static final DamageSource ALCHEMICAL = new DamageSource("ALCHEMICAL");

    public static DamageSource indirectAlchemical(Entity pSource, @Nullable Entity pIndirectEntity) {
        return (new IndirectEntityDamageSource("indirectAlchemical", pSource, pIndirectEntity)).bypassArmor().setMagic();
    }

    public static void addDefaultDamageType(String damageType) {
        DAMAGE_TYPES.add(damageType);
    }

    public static List<String> getDefaultDamageTypes() {
        return DAMAGE_TYPES;
    }
}
