import { BrowserRouter, Routes, Route } from 'react-router-dom';
import styled from 'styled-components';
import Navbar from './components/Navbar';
import Group from './pages/Group';
import Home from './pages/Home';
import Login from './pages/Login';
import Register from './pages/Register';

const Container = styled.div``;

function App() {
  const user = null;

  return (
    <Container>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route index element={user ? <Home /> : <Login />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/group" element={<Group />} />
        </Routes>
      </BrowserRouter>
    </Container>
  );
}

export default App;
