syntax = "proto3";


option java_multiple_files = true;
option java_package = "grpc.ca.post";
option java_outer_classname = "PostProtoImpl";

package post;

service PostService {
  rpc listPosts (User) returns (stream Post);
  rpc reportPost (Post) returns (Post);
}

service UserService {
  rpc requestDiscount (User) returns (bool);
}

service CompanyService {
  rpc requestDiscount (Company) returns (bool);
}

message Post {
  int32 id = 1;
  string name = 2;
  string address = 3;
  bool led = 4;
}

message User {
  int32 id = 1;
  string name = 2;
  string address = 3;
}

message Company {
  int32 id = 1;
  string name = 2;
  string address = 3;
}


