package org.sid.project_allports.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: PatientService.proto")
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPatients",
      requestType = org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest.class,
      responseType = org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest, org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
          PatientServiceGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod = 
              io.grpc.MethodDescriptor.<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest, org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "getAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getAllPatients"))
                  .build();
          }
        }
     }
     return getGetAllPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatient",
      requestType = org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest.class,
      responseType = org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> getGetPatientMethod() {
    io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest, org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> getGetPatientMethod;
    if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
          PatientServiceGrpc.getGetPatientMethod = getGetPatientMethod = 
              io.grpc.MethodDescriptor.<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest, org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "getPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getPatient"))
                  .build();
          }
        }
     }
     return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> getAddPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPatient",
      requestType = org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest.class,
      responseType = org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest,
      org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> getAddPatientMethod() {
    io.grpc.MethodDescriptor<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest, org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> getAddPatientMethod;
    if ((getAddPatientMethod = PatientServiceGrpc.getAddPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getAddPatientMethod = PatientServiceGrpc.getAddPatientMethod) == null) {
          PatientServiceGrpc.getAddPatientMethod = getAddPatientMethod = 
              io.grpc.MethodDescriptor.<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest, org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "addPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("addPatient"))
                  .build();
          }
        }
     }
     return getAddPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    return new PatientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllPatients(org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    /**
     */
    public void getPatient(org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     */
    public void addPatient(org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllPatientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest,
                org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse>(
                  this, METHODID_GET_ALL_PATIENTS)))
          .addMethod(
            getGetPatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest,
                org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse>(
                  this, METHODID_GET_PATIENT)))
          .addMethod(
            getAddPatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest,
                org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse>(
                  this, METHODID_ADD_PATIENT)))
          .build();
    }
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractStub<PatientServiceStub> {
    private PatientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllPatients(org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatient(org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPatient(org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest request,
        io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse getAllPatients(org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse getPatient(org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse addPatient(org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse> getAllPatients(
        org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse> getPatient(
        org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse> addPatient(
        org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PATIENTS = 0;
  private static final int METHODID_GET_PATIENT = 1;
  private static final int METHODID_ADD_PATIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetAllPatientsResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.GetPatientByIdResponse>) responseObserver);
          break;
        case METHODID_ADD_PATIENT:
          serviceImpl.addPatient((org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.project_allports.stub.PatientServiceOuterClass.AddPatientResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.project_allports.stub.PatientServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getGetAllPatientsMethod())
              .addMethod(getGetPatientMethod())
              .addMethod(getAddPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
