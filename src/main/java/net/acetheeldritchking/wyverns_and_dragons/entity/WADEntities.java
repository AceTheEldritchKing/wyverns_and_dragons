package net.acetheeldritchking.wyverns_and_dragons.entity;

import net.acetheeldritchking.wyverns_and_dragons.WyvernsAndDragons;
import net.acetheeldritchking.wyverns_and_dragons.entity.dragon.DragonEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WADEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WyvernsAndDragons.MOD_ID);

    public static final RegistryObject<EntityType<DragonEntity>> DRAGON = ENTITIES.register("dragon", () -> {
        return EntityType.Builder.of(DragonEntity::new, MobCategory.MONSTER)
                .sized(1.0F, 1.0F)
                .build("wyverns_and_dragons:dragon");
    });

}
