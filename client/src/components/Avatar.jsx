import styled from 'styled-components';

const Container = styled.div`
  display: flex;
  position: relative;
  height: 400px;
`;

const Cover = styled.img`
  width: 100%;
  height: 300px;
  object-fit: cover;
  position: relative;
`;

const AvatarImg = styled.img`
  width: 150px;
  height: 150px;
  border-radius: 50%;
  object-fit: cover;
  position: absolute;
  left: 0;
  right: 0;
  margin: auto;
  top: 200px;
  border: 3px solid white;
`;

const Avatar = () => {
  return (
    <Container>
      <Cover src="/assets/cover.jpeg" />
      <AvatarImg src="/assets/noAvatar.jpeg" />
    </Container>
  );
};

export default Avatar;
