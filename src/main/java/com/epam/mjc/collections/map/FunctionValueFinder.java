package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (int value : functionMap.values()) {
            if (value == requiredValue) {
                return true;
            }
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();

        for (int number : sourceList) {
            int functionValue = 5 * number + 2;
            functionMap.put(number, functionValue);
        }

        return functionMap;
    }
}
