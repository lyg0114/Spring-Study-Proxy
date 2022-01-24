package hello.proxy.pureproxy.concreateproxy.code;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class TimeProxy extends ConcreateLogic{

    private final ConcreateLogic concreateLogic;

    @Override
    public String operation(){

        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();
        String result = concreateLogic.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator 종료 resultTime={}", resultTime);

        return result;

    }
}
