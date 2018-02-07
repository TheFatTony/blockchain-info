package com.chieftain.blockchaininfo.config;

import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.bitfinex.v1.BitfinexExchange;
import org.knowm.xchange.kraken.KrakenExchange;
import org.knowm.xchange.poloniex.PoloniexExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ExchangesConfig {

    @Bean
    public BitfinexExchange bitfinexExchange() {
        ExchangeSpecification spec = new ExchangeSpecification(BitfinexExchange.class);

        BitfinexExchange bitfinexExchange = (BitfinexExchange) ExchangeFactory.INSTANCE.createExchange(spec);

//		ExchangesRegistry.addExchange(BitfinexExchange.class.getName(), bitfinexExchange);
        return bitfinexExchange;
    }

    @Bean
    public KrakenExchange krakenExchange() {
        ExchangeSpecification spec = new ExchangeSpecification(KrakenExchange.class);

        KrakenExchange krakenExchange = (KrakenExchange) ExchangeFactory.INSTANCE.createExchange(spec);

//		ExchangesRegistry.addExchange(KrakenExchange.class.getName(), krakenExchange);
        return krakenExchange;
    }

    @Bean
    public PoloniexExchange poloniexExchange() {
        ExchangeSpecification spec = new ExchangeSpecification(PoloniexExchange.class);

        PoloniexExchange poloniexExchange = (PoloniexExchange) ExchangeFactory.INSTANCE.createExchange(spec);

//		ExchangesRegistry.addExchange(PoloniexExchange.class.getName(), poloniexExchange);
        return poloniexExchange;
    }

}
