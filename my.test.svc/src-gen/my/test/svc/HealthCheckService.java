package my.test.svc;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: health.proto.  ")
public interface HealthCheckService {

    
    default Single<my.test.svc.HealthCheckResponse> check(Single<my.test.svc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Server streaming method
     * </pre>
     */
    default Flowable<my.test.svc.HealthCheckResponse> watchServer(Single<my.test.svc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Client streaming method
     * </pre>
     */
    default Single<my.test.svc.HealthCheckResponse> watchClient(Flowable<my.test.svc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  bidi streaming method
     * </pre>
     */
    default Flowable<my.test.svc.HealthCheckResponse> watchBidi(Flowable<my.test.svc.HealthCheckRequest> requests)  {
        return null;
    }
}
