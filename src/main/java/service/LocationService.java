package service;

import entity.Cone;

public interface LocationService {
    boolean isOnXAxis(Cone cone);

    boolean isOnYAxis(Cone cone);

    boolean isOnZAxis(Cone cone);
}
