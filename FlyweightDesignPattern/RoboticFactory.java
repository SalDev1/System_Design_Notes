package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    
    private static Map<String,IRobot> robotObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if(robotObjectCache.containsKey(robotType)) {
            return robotObjectCache.get(robotType);
        } else {
            if(robotType == "HUMANOID") {
              Sprites humanoidSprite = new Sprites();
              IRobot humanoidObject = new HumanoidRobot(robotType, humanoidSprite);
              robotObjectCache.put(robotType, humanoidObject);
              return humanoidObject;
            } else if(robotType == "ROBOTICDOG") {
                Sprites roboticDogSprite = new Sprites();
                IRobot roboticDogObject = new HumanoidRobot(robotType, roboticDogSprite);
                robotObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;
            }
        }
        return null;
    }
    
}
