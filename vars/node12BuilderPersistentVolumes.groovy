def call(Map config) {
  return [
    [
      path: '/home/jenkins/.npm',
      claimName: "${config.project}-home-jenkins-npm",
      sizeGiB: 1
    ]
  ]
}