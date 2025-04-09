# 🎾 Refactorización del Código de Puntuación de Tenis

Este proyecto contiene una versión refactorizada de un método Java que calcula y devuelve el marcador de un partido de tenis en formato textual. La refactorización se centra en mejorar la claridad, modularidad y mantenibilidad del código.

## 📌 Objetivo Original

El método original `getScore` tenía como propósito devolver una cadena con la puntuación del partido de tenis siguiendo las reglas clásicas:
- Puntuaciones individuales: Love, Fifteen, Thirty, Forty
- Empates: Love-All, Fifteen-All, etc., y Deuce a partir de 3-3
- Ventajas y victorias: Advantage y Win a partir del cuarto punto

Sin embargo, el código original tenía problemas de legibilidad, uso innecesario de bucles y estructuras repetitivas.

---

## ✅ Cambios Realizados

### 1. **Modularización del código**
Se dividió la lógica en varios métodos privados:
- `getEqualScore(int score)`
- `getAdvantageOrWin(int score1, int score2)`
- `getScoreDescription(int score)`
- `getRegularScore(int score1, int score2)`

Esto facilita la comprensión y el mantenimiento.

---

### 2. **Eliminación de lógica redundante**
En el código original se usaba un bucle `for` para construir el marcador, lo cual fue reemplazado por una concatenación directa con métodos auxiliares.

```java
return getScoreDescription(score1) + "-" + getScoreDescription(score2);
