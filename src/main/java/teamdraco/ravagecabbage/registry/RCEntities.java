package teamdraco.ravagecabbage.registry;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamdraco.ravagecabbage.RavageAndCabbage;
import teamdraco.ravagecabbage.common.entity.CabbagerEntity;
import teamdraco.ravagecabbage.common.entity.RCRavagerEntity;
import teamdraco.ravagecabbage.common.entity.item.CabbageItemEntity;

public class RCEntities {
	
    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES, RavageAndCabbage.MOD_ID);

    public static final RegistryObject<EntityType<CabbageItemEntity>> CABBAGE = create("cabbage", EntityType.Builder.<CabbageItemEntity>of(CabbageItemEntity::new, MobCategory.MISC).sized(1.0f, 1.0f));
    public static final RegistryObject<EntityType<CabbagerEntity>> CABBAGER = create("cabbager", EntityType.Builder.of(CabbagerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<RCRavagerEntity>> RAVAGER = create("ravager", EntityType.Builder.of(RCRavagerEntity::new, MobCategory.CREATURE).sized(1.95F, 2.2F).clientTrackingRange(10));


    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return REGISTER.register(name, () -> builder.build(RavageAndCabbage.MOD_ID + "." + name));
    }
}