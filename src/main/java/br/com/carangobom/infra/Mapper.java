package br.com.carangobom.infra;

public interface Mapper<S, T> {
    T map(S source);
}
