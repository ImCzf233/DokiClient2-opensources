/*
 * Decompiled with CFR 0_122.
 */
package just.monika.IQ救不了主播你因为你反编译我端子.gui.screen.component.particles;

import just.monika.IQ救不了主播你因为你反编译我端子.util.RenderingUtil;
import just.monika.IQ救不了主播你因为你反编译我端子.util.render.Colors;

public class BottomLeftParticle
extends Particle {
    public BottomLeftParticle(float posX, float posY, float size, float speed, float alpha) {
        super(posX, posY, size, speed, alpha);
    }

    @Override
    public void render(ParticleManager p) {
        super.render(p);
        this.setPosY(this.getPosY() - this.getSpeed());
        this.setPosX(this.getPosX() + this.getSpeed());
        RenderingUtil.drawFullCircle(this.getPosX(), this.getPosY(), this.getSize(), Colors.getColor(255, 255, 255, (int)this.getAlpha()));
    }
}

