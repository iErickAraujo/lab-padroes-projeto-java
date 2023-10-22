package edu.erick.gof;

import edu.erick.gof.Facade.Facede;
import edu.erick.gof.Singleton.SingletonEager;
import edu.erick.gof.Singleton.SingletonLazy;
import edu.erick.gof.Singleton.SingletonLazyHolder;
import edu.erick.gof.Strategy.Comportamento;
import edu.erick.gof.Strategy.ComportamentoAgressivo;
import edu.erick.gof.Strategy.ComportamentoDefensivo;
import edu.erick.gof.Strategy.ComportamentoNormal;
import edu.erick.gof.Strategy.Robo;

public class Test {
    public static void main(String[] args) {
        // Testes de Design Pattern
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        Facede facede = new Facede();
        facede.migrarCliente("Erick", "1234567859");
    }
}
