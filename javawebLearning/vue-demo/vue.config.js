const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    // 项目启动端口之后会变成8090
    port: 8090,
  },
})
