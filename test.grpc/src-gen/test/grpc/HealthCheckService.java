package test.grpc;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: health.proto.  ")
public interface HealthCheckService {

    
    default Single<test.grpc.HealthCheckResponse> check(Single<test.grpc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Server streaming method
     * </pre>
     */
    default Flowable<test.grpc.HealthCheckResponse> watchServer(Single<test.grpc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Client streaming method
     * </pre>
     */
    default Single<test.grpc.HealthCheckResponse> watchClient(Flowable<test.grpc.HealthCheckRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  bidi streaming method
     * </pre>
     */
    default Flowable<test.grpc.HealthCheckResponse> watchBidi(Flowable<test.grpc.HealthCheckRequest> requests)  {
        return null;
    }
}
