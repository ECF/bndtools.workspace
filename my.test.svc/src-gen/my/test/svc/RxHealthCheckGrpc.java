package my.test.svc;

import static my.test.svc.HealthCheckGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: health.proto")
public final class RxHealthCheckGrpc {
    private RxHealthCheckGrpc() {}

    public static RxHealthCheckStub newRxStub(io.grpc.Channel channel) {
        return new RxHealthCheckStub(channel);
    }

    public static final class RxHealthCheckStub extends io.grpc.stub.AbstractStub<RxHealthCheckStub> {
        private HealthCheckGrpc.HealthCheckStub delegateStub;

        private RxHealthCheckStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = HealthCheckGrpc.newStub(channel);
        }

        private RxHealthCheckStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = HealthCheckGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxHealthCheckStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxHealthCheckStub(channel, callOptions);
        }

        public io.reactivex.Single<my.test.svc.HealthCheckResponse> check(io.reactivex.Single<my.test.svc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<my.test.svc.HealthCheckRequest, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(my.test.svc.HealthCheckRequest request, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        delegateStub.check(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> watchServer(io.reactivex.Single<my.test.svc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<my.test.svc.HealthCheckRequest, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(my.test.svc.HealthCheckRequest request, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        delegateStub.watchServer(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Client streaming method
         * </pre>
         */
        public io.reactivex.Single<my.test.svc.HealthCheckResponse> watchClient(io.reactivex.Flowable<my.test.svc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<my.test.svc.HealthCheckRequest> apply(io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        return delegateStub.watchClient(observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  bidi streaming method
         * </pre>
         */
        public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> watchBidi(io.reactivex.Flowable<my.test.svc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<my.test.svc.HealthCheckRequest> apply(io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        return delegateStub.watchBidi(observer);
                    }
                }, getCallOptions());
        }

        public io.reactivex.Single<my.test.svc.HealthCheckResponse> check(my.test.svc.HealthCheckRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<my.test.svc.HealthCheckRequest, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(my.test.svc.HealthCheckRequest request, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        delegateStub.check(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> watchServer(my.test.svc.HealthCheckRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToMany(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<my.test.svc.HealthCheckRequest, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(my.test.svc.HealthCheckRequest request, io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse> observer) {
                        delegateStub.watchServer(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class HealthCheckImplBase implements io.grpc.BindableService {

        public io.reactivex.Single<my.test.svc.HealthCheckResponse> check(io.reactivex.Single<my.test.svc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> watchServer(io.reactivex.Single<my.test.svc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Client streaming method
         * </pre>
         */
        public io.reactivex.Single<my.test.svc.HealthCheckResponse> watchClient(io.reactivex.Flowable<my.test.svc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  bidi streaming method
         * </pre>
         */
        public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> watchBidi(io.reactivex.Flowable<my.test.svc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            my.test.svc.HealthCheckGrpc.getCheckMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            my.test.svc.HealthCheckRequest,
                                            my.test.svc.HealthCheckResponse>(
                                            this, METHODID_CHECK)))
                    .addMethod(
                            my.test.svc.HealthCheckGrpc.getWatchServerMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            my.test.svc.HealthCheckRequest,
                                            my.test.svc.HealthCheckResponse>(
                                            this, METHODID_WATCH_SERVER)))
                    .addMethod(
                            my.test.svc.HealthCheckGrpc.getWatchClientMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            my.test.svc.HealthCheckRequest,
                                            my.test.svc.HealthCheckResponse>(
                                            this, METHODID_WATCH_CLIENT)))
                    .addMethod(
                            my.test.svc.HealthCheckGrpc.getWatchBidiMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            my.test.svc.HealthCheckRequest,
                                            my.test.svc.HealthCheckResponse>(
                                            this, METHODID_WATCH_BIDI)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_CHECK = 0;
    public static final int METHODID_WATCH_SERVER = 1;
    public static final int METHODID_WATCH_CLIENT = 2;
    public static final int METHODID_WATCH_BIDI = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final HealthCheckImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(HealthCheckImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_CHECK:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((my.test.svc.HealthCheckRequest) request,
                            (io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<my.test.svc.HealthCheckRequest>, io.reactivex.Single<my.test.svc.HealthCheckResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<my.test.svc.HealthCheckResponse> apply(io.reactivex.Single<my.test.svc.HealthCheckRequest> single) {
                                    return serviceImpl.check(single);
                                }
                            });
                    break;
                case METHODID_WATCH_SERVER:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToMany((my.test.svc.HealthCheckRequest) request,
                            (io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<my.test.svc.HealthCheckRequest>, io.reactivex.Flowable<my.test.svc.HealthCheckResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Flowable<my.test.svc.HealthCheckResponse> apply(io.reactivex.Single<my.test.svc.HealthCheckRequest> single) {
                                    return serviceImpl.watchServer(single);
                                }
                            });
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_WATCH_CLIENT:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rxgrpc.stub.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>) responseObserver,
                            serviceImpl::watchClient, serviceImpl.getCallOptions(methodId));
                case METHODID_WATCH_BIDI:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rxgrpc.stub.ServerCalls.manyToMany(
                            (io.grpc.stub.StreamObserver<my.test.svc.HealthCheckResponse>) responseObserver,
                            serviceImpl::watchBidi, serviceImpl.getCallOptions(methodId));
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
