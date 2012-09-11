package com.liquable.deco.analyze;

import java.util.Arrays;
import java.util.List;

public enum Sentiment
{

    HAPPY(Arrays.asList("")), SAD(Arrays.asList("")), TOUCHED(Arrays.asList("")), USEFUL(
        Arrays.asList("")), WEIRD(Arrays.asList("")), BORING(Arrays.asList("")), AFRAID(
        Arrays.asList("")), ANGRY(Arrays.asList(""));

    private List<String> expressions;

    private Sentiment(final List<String> expressions)
    {
        this.expressions = expressions;
    }

    public List<String> getExpressions()
    {
        return expressions;
    }
}
