/*
 * Decompiled with CFR 0_122.
 */
package just.monika.IQ救不了主播你因为你反编译我端子.management.waypoints;

import net.minecraft.util.Vec3;

public class Waypoint {
    private String name;
    private Vec3 vec3;
    private int color;
    private String address;

    public Waypoint(String name, Vec3 vec3, int color, String address) {
        this.name = name;
        this.vec3 = vec3;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Vec3 getVec3() {
        return this.vec3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVec3(Vec3 vec3) {
        this.vec3 = vec3;
    }

    public void setVec3(double x, double y, double z) {
        this.vec3 = new Vec3(x, y, z);
    }

    public int getColor() {
        return this.color;
    }

    public String getAddress() {
        return this.address;
    }
}

