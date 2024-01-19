FROM nginx:stable-alpine
RUN sed -i 's/#error_page/error_page/' /etc/nginx/conf.d/default.conf
COPY dist /usr/share/nginx/html
COPY ./doc/docker/nginx/conf/nginx.conf /etc/nginx/nginx.conf
