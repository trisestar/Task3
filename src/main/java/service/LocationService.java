package service;

import entity.Cone;

public interface LocationService {
    public boolean isOnXAxis(Cone cone);

    public boolean isOnYAxis(Cone cone);

    public boolean isOnZAxis(Cone cone);
}
