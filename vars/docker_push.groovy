def call(String project, String imageTag, String dockerhub-user){
 withCredentials([usernamePassword(
          credentialsId: "dockhub-login", passwordVariable: "dockerHubPass",
          usernameVariable: "dockerHubUser")]) {
          sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
          sh "docker image tag ${project}:{imageTag} ${dockerHubUser}/${project}:{imageTag}"
          sh "docker push ${dockerHubUser}/${project}:{imageTag}"
        }
}
