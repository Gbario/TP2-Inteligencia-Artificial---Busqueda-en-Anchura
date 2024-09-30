public class RobotBusquedaAnchura {

    public static void main(String[] args) {
        int posicionObjetivo = -10;  // Posici�n de montaje A
        int posicionActual = 0;  // Posici�n inicial B
        int tama�oMovimiento = 1;  // Distancia en cada paso
        int totalMovimientos = 0;  // Contador de movimientos
        int distanciaTotal = 0;  // Distancia total recorrida

        while (true) {
            // Mover a la izquierda
            posicionActual -= tama�oMovimiento;
            totalMovimientos++;
            distanciaTotal += tama�oMovimiento;
            System.out.println("Se mueve a la izquierda: " + posicionActual);

            // Verificar si encontramos A
            if (posicionActual == posicionObjetivo) {
                System.out.println("Posici�n objetivo encontrada en " + totalMovimientos + " movimientos y " + distanciaTotal + " cm recorridos.");
                break;
            }

            // Volver al origen
            distanciaTotal += tama�oMovimiento;  
            posicionActual += tama�oMovimiento;

            // Mover a la derecha
            posicionActual += tama�oMovimiento;
            totalMovimientos++;
            distanciaTotal += tama�oMovimiento;
            System.out.println("Se mueve a la derecha: " + posicionActual);

            // Verificar si encontramos la A
            if (posicionActual == posicionObjetivo) {
                System.out.println("Posici�n objetivo encontrada en " + totalMovimientos + " movimientos y " + distanciaTotal + " cm recorridos.");
                break;
            }

            // Volver al origen
            distanciaTotal += tama�oMovimiento; 
            posicionActual -= tama�oMovimiento;

            // Aumentar la distancia de cada paso por 1 cm
            tama�oMovimiento++;
        }
    }
}