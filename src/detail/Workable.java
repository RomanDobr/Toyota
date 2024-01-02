package detail;

import exceptions.StartCarException;

public interface Workable {
    default boolean isRun(Wheel[] wheels, GasTank gasTank, Electrician electrician, Engine engine) throws StartCarException {
        if (wheels.length < 4) {
            throw new StartCarException("Ошибка: Отсутствуют колеса, движение не возможно");
        } else if (wheels[0].isHole() || wheels[1].isHole() || wheels[2].isHole() || wheels[3].isHole()) {
            throw new StartCarException("Ошибка: одно из колес проколото, движение не возможно");
        } else if (gasTank.getCountFuel() <= 0) {
            throw new StartCarException("Ошибка: бензобак пуст, движение не возможно");
        } else if (!electrician.isFunctional()) {
            throw new StartCarException("Ошибка: электрика не работает, движение не возможно");
        } else if (!engine.isFunctional()) {
            throw new StartCarException("Ошибка: не работает двигатель, движение не возможно");
        }
        System.out.println("Машина едет");
        return true;
    }

    default boolean isStop() {
        System.out.println("Машина остановлена");
        return false;
    }

    default boolean isLight() {
        System.out.println("Фары включены у машины");
        return true;
    }

}
