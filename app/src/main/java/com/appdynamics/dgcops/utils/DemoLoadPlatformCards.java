package com.appdynamics.dgcops.utils;

import com.appdynamics.dgcops.model.Platform;
import com.appdynamics.dgcops.model.PlatformCard;

import java.util.ArrayList;
import java.util.List;

public class DemoLoadPlatformCards {

    public static ArrayList<PlatformCard> loadPlatformCards() {
        ArrayList<PlatformCard> platformCards = new ArrayList<>();
        platformCards.add((new PlatformCard(DemoECConstants.PLATFORM_ONE_NAME, DemoECConstants.CONTROLLER_HEALTH_P1, DemoECConstants.EVENT_SERVICE_HEALTH_P1)));
        platformCards.add((new PlatformCard(DemoECConstants.PLATFORM_TWO_NAME, DemoECConstants.CONTROLLER_HEALTH_P2, DemoECConstants.EVENT_SERVICE_HEALTH_P2)));


        return platformCards;
    }
}
