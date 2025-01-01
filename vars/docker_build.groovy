def call(String project_name, String image_tag, String dockerhub_user, String message_to_print){
  sh "docker build -t ${dockerhub_user}/${project_name}:${image_tag} ."
  echo "${message_to_print}"
}
