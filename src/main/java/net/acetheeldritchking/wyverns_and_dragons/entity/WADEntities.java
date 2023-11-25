package net.acetheeldritchking.wyverns_and_dragons.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WADEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "wyverns_and_dragons");

    public static final RegistryObject<EntityType<DragonEntity>> DRAGON = ENTITIES.register("dragon", () -> {
        return EntityType.Builder.of(DragonEntity::new, MobCategory.CREATURE)
                .sized(1.0F, 1.0F)
                .build("wyverns_and_dragons:dragon");
    });

}
