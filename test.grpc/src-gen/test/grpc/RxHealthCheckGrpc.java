package test.grpc;

import static test.grpc.HealthCheckGrpc.getServiceDescriptor;
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

        public io.reactivex.Single<test.grpc.HealthCheckResponse> check(io.reactivex.Single<test.grpc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<test.grpc.HealthCheckRequest, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(test.grpc.HealthCheckRequest request, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        delegateStub.check(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<test.grpc.HealthCheckResponse> watchServer(io.reactivex.Single<test.grpc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<test.grpc.HealthCheckRequest, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(test.grpc.HealthCheckRequest request, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        delegateStub.watchServer(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Client streaming method
         * </pre>
         */
        public io.reactivex.Single<test.grpc.HealthCheckResponse> watchClient(io.reactivex.Flowable<test.grpc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>, io.grpc.stub.StreamObserver<test.grpc.HealthCheckRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<test.grpc.HealthCheckRequest> apply(io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        return delegateStub.watchClient(observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  bidi streaming method
         * </pre>
         */
        public io.reactivex.Flowable<test.grpc.HealthCheckResponse> watchBidi(io.reactivex.Flowable<test.grpc.HealthCheckRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>, io.grpc.stub.StreamObserver<test.grpc.HealthCheckRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<test.grpc.HealthCheckRequest> apply(io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        return delegateStub.watchBidi(observer);
                    }
                }, getCallOptions());
        }

        public io.reactivex.Single<test.grpc.HealthCheckResponse> check(test.grpc.HealthCheckRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<test.grpc.HealthCheckRequest, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(test.grpc.HealthCheckRequest request, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        delegateStub.check(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<test.grpc.HealthCheckResponse> watchServer(test.grpc.HealthCheckRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToMany(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<test.grpc.HealthCheckRequest, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>>() {
                    @java.lang.Override
                    public void accept(test.grpc.HealthCheckRequest request, io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse> observer) {
                        delegateStub.watchServer(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class HealthCheckImplBase implements io.grpc.BindableService {

        public io.reactivex.Single<test.grpc.HealthCheckResponse> check(io.reactivex.Single<test.grpc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Server streaming method
         * </pre>
         */
        public io.reactivex.Flowable<test.grpc.HealthCheckResponse> watchServer(io.reactivex.Single<test.grpc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Client streaming method
         * </pre>
         */
        public io.reactivex.Single<test.grpc.HealthCheckResponse> watchClient(io.reactivex.Flowable<test.grpc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  bidi streaming method
         * </pre>
         */
        public io.reactivex.Flowable<test.grpc.HealthCheckResponse> watchBidi(io.reactivex.Flowable<test.grpc.HealthCheckRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            test.grpc.HealthCheckGrpc.getCheckMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            test.grpc.HealthCheckRequest,
                                            test.grpc.HealthCheckResponse>(
                                            this, METHODID_CHECK)))
                    .addMethod(
                            test.grpc.HealthCheckGrpc.getWatchServerMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            test.grpc.HealthCheckRequest,
                                            test.grpc.HealthCheckResponse>(
                                            this, METHODID_WATCH_SERVER)))
                    .addMethod(
                            test.grpc.HealthCheckGrpc.getWatchClientMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            test.grpc.HealthCheckRequest,
                                            test.grpc.HealthCheckResponse>(
                                            this, METHODID_WATCH_CLIENT)))
                    .addMethod(
                            test.grpc.HealthCheckGrpc.getWatchBidiMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            test.grpc.HealthCheckRequest,
                                            test.grpc.HealthCheckResponse>(
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
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((test.grpc.HealthCheckRequest) request,
                            (io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<test.grpc.HealthCheckRequest>, io.reactivex.Single<test.grpc.HealthCheckResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<test.grpc.HealthCheckResponse> apply(io.reactivex.Single<test.grpc.HealthCheckRequest> single) {
                                    return serviceImpl.check(single);
                                }
                            });
                    break;
                case METHODID_WATCH_SERVER:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToMany((test.grpc.HealthCheckRequest) request,
                            (io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<test.grpc.HealthCheckRequest>, io.reactivex.Flowable<test.grpc.HealthCheckResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Flowable<test.grpc.HealthCheckResponse> apply(io.reactivex.Single<test.grpc.HealthCheckRequest> single) {
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
                            (io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>) responseObserver,
                            serviceImpl::watchClient, serviceImpl.getCallOptions(methodId));
                case METHODID_WATCH_BIDI:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rxgrpc.stub.ServerCalls.manyToMany(
                            (io.grpc.stub.StreamObserver<test.grpc.HealthCheckResponse>) responseObserver,
                            serviceImpl::watchBidi, serviceImpl.getCallOptions(methodId));
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
