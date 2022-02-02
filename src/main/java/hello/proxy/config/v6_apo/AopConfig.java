package hello.proxy.config.v6_apo;

import hello.proxy.config.AppV1config;
import hello.proxy.config.AppV2config;
import hello.proxy.config.v6_apo.aspect.LogTraceAspect;
import hello.proxy.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppV1config.class, AppV2config.class})
public class AopConfig {

    @Bean
    public LogTraceAspect logTraceAspect(LogTrace logTrace){
       return new LogTraceAspect(logTrace);
    }

}
