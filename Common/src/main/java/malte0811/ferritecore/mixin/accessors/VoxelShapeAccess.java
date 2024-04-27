package malte0811.ferritecore.mixin.accessors;

import net.minecraft.world.phys.shapes.DiscreteVoxelShape;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;


@Mixin(VoxelShape.class)
public interface VoxelShapeAccess {
    @Accessor
    DiscreteVoxelShape getShape();

    @Accessor
    @Nullable
    VoxelShape[] getFaces();

    @Accessor
    @Mutable
    void setShape(DiscreteVoxelShape newPart);

    @Accessor
    void setFaces(@Nullable VoxelShape[] newCache);
}
