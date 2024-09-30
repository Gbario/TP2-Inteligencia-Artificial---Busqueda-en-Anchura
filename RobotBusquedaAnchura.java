public class RobotBusquedaAnchura {

    public static void main(String[] args) {
        int posicionObjetivo = -10;  // Posición de montaje A
        int posicionActual = 0;  // Posición inicial B
        int tamañoMovimiento = 1;  // Distancia en cada paso
        int totalMovimientos = 0;  // Contador de movimientos
        int distanciaTotal = 0;  // Distancia total recorrida

        while (true) {
            // Mover a la izquierda
            posicionActual -= tamañoMovimiento;
            totalMovimientos++;
            distanciaTotal += tamañoMovimiento;
            System.out.println("Se mueve a la izquierda: " + posicionActual);

            // Verificar si encontramos A
            if (posicionActual == posicionObjetivo) {
                System.out.println("Posición objetivo encontrada en " + totalMovimientos + " movimientos y " + distanciaTotal + " cm recorridos.");
                break;
            }

            // Volver al origen
            distanciaTotal += tamañoMovimiento;  
            posicionActual += tamañoMovimiento;

            // Mover a la derecha
            posicionActual += tamañoMovimiento;
            totalMovimientos++;
            distanciaTotal += tamañoMovimiento;
            System.out.println("Se mueve a la derecha: " + posicionActual);

            // Verificar si encontramos la A
            if (posicionActual == posicionObjetivo) {
                System.out.println("Posición objetivo encontrada en " + totalMovimientos + " movimientos y " + distanciaTotal + " cm recorridos.");
                break;
            }

            // Volver al origen
            distanciaTotal += tamañoMovimiento; 
            posicionActual -= tamañoMovimiento;

            // Aumentar la distancia de cada paso por 1 cm
            tamañoMovimiento++;
        }
    }
}